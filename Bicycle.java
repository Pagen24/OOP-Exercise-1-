public class Bicycle
{
	private String ownerName, TagNo;
	
	public Bicycle( ) {
		ownerName = "kurt scholl";
		TagNo = "2003-456L";
		
		
	}
	public String getOwnerName() {
		return ownerName;
	}
	public String getTagNo(){
		return TagNo;
	}
	public void setOwnerName (String name) {
		ownerName = name;
	}
	    public void setTagNo(String name){
			TagNo = name;
		}
}
