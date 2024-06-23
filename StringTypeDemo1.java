package StringClass;
public class StringTypeDemo1 {
	public static void main(String[]  args)
	{
	//String Concatenation
			String str="Hello";
			
			long startTime=System.currentTimeMillis();
			{
			for(int i =0; i<10000;i++) //('i' goes from 0 to 9999) 
				{
				str = str + " World";
			    }
			long endTime=System.currentTimeMillis();
			 long totalDuration= endTime-startTime;
			 System.out.println(str);
			 System.out.println("String Concatenation Time: " + totalDuration +" ms");
		
			//StringBuffer
	            StringBuffer sb = new StringBuffer("Hello");
			    
		        startTime = System.currentTimeMillis();
		        for( int i=0 ; i<10000 ; i++) {
		        	sb.append(" World");
		        	
		        }
		    	endTime = System.currentTimeMillis();
		        totalDuration = (endTime - startTime);
		        System.out.println("StringBuffer Concatenation Time: " + totalDuration +" ms");
			
			//StringBuilder
			  StringBuilder sb1= new StringBuilder("Hello");
			  startTime = System.currentTimeMillis();
			  for( int i=0 ; i<10000; i++) {
		        	sb.append(" World");
		        	
		        }
			  endTime = System.currentTimeMillis();
			  totalDuration = (endTime - startTime);
		       System.out.println("StringBuilder Concatenation Time: " + totalDuration+" ms");
			
	                  
		      //String Immutable                 non changeble behavior is called Immutable
		       String name="Immutable";
		       String name1=name.concat(" String");
		       System.out.println(name);
		       System.out.println(name1);
		       
		       
		       //String Buffer Mutable                         any changes we can perform
		       StringBuffer sb2= new StringBuffer("Mutable");
		       sb2.append(" Modified Buffer");
		       System.out.println(sb2);
		       
		       //String Builder Mutable
		       StringBuilder sb3=new StringBuilder("Mutable");
		       sb3.append(" modified Builder");
		       System.out.println(sb3);
			}
}
}
		       
		       
		       
			