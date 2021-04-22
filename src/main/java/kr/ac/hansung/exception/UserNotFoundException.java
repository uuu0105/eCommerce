package kr.ac.hansung.exception;

public class UserNotFoundException extends RuntimeException {
	
	// serializable class를 상속받은 runtimeexception class는 serializable 버전을 써줘야한다. serialize, de-serialize 시 버전 일관성을 위함.
	private static final long serialVersionUID = 2006875985431069011L; 
	
	private long userId;
	
	public UserNotFoundException(long userId) {
		super();
		this.userId = userId;
	}
	
	public long getUserId() {
		return userId;
	}
}
