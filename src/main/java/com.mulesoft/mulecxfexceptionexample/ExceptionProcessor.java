package com.mulesoft.mulecxfexceptionexample;

import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractMessageTransformer;

/**
 * Created by IntelliJ IDEA.
 * User: davideason
 * Date: 6/9/11
 * Time: 5:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class ExceptionProcessor extends AbstractMessageTransformer
{
    @Override
    public Object transformMessage(MuleMessage muleMessage, String s) throws TransformerException {

        String payloadMsg = "";

        payloadMsg = (String)muleMessage.getPayload();

//        if (payloadMsg == "SomeException") {
//            return muleMessage;
//        }
        payloadMsg = payloadMsg + " some extra stuff";
        muleMessage.setOutboundProperty("retryCount",0);

        return payloadMsg;
    }
}
