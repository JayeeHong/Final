package web.dto;

public class Chat { // 채팅내역
	
	private int chatRoomNo; // 채팅방 번호

	public int getChatRoomNo() {
		return chatRoomNo;
	}
	public void setChatRoomNo(int chatRoomNo) {
		this.chatRoomNo = chatRoomNo;
	}
	
	@Override
	public String toString() {
		return "Chat [chatRoomNo=" + chatRoomNo + "]";
	}

}
