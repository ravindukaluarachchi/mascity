package com.rav.agents;

import madkit.kernel.Agent;
import madkit.kernel.Message;

/*
 *
 * */
public class SensorManagerAgent extends Agent {


    @Override
    protected void activate() {

    }

    @Override
    protected void live() {

    }

    @Override
    protected void end() {

    }

    public void sendComplaint(){
        Message m = new Message();
        sendMessageAndWaitForReply("community1","group1",
                "role1",m);
    }
}
