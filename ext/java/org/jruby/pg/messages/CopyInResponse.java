package org.jruby.pg.messages;

public class CopyInResponse extends CopyResponse {
  public CopyInResponse(Format overallFormat, Format[] columnFormats) {
    super(overallFormat, columnFormats);
  }

  @Override
  public MessageType getType() {
    return MessageType.CopyInResponse;
  }
}
