package arraypackage;

public class duplicatesinarray {
	
	public static void main(String args[]) {
		
		int a[]= {100,200,200,400,400};
		boolean flag=false;
		
		for(int i=0;i<a.length;i++) {
			
			for (int j=i+1; j<a.length;j++) {
				
				if(a[i]==a[j])
				{
				 System.out.println("Found Duplicate Element" + a[i]);
				 flag=true;
				}
			}	
				
		}
		if(flag == false) {
			System.out.println("Duplicate not found");
		
		}
			
		}
		
	}


