package hudson.plugins.jabber.im.transport;

import hudson.plugins.im.IMMessageListener;

import org.jivesoftware.smack.chat.Chat;
import org.jivesoftware.smack.MessageListener;

/**
 * Wraps an {@link IMMessageListener} in a Smack {@link PacketListener}.
 * 
 * @author kutzi
 */
class JabberMessageListenerAdapter extends AbstractJabberMessageListenerAdapter implements MessageListener {

    public JabberMessageListenerAdapter(IMMessageListener listener,
    		JabberIMConnection connection, Chat chat) {
        super(listener, connection);
    }
}
