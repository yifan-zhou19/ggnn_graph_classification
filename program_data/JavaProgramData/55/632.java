package <missing>;

public class GlobalMembers
{
	public static int pow(int m,int n)
	{
	   int pi = 1;
	   int i;
	   for (i = 1;i <= n;i++)
	   {
		  pi = pi * m;
	   }
		return pi;
	}

	public static void Get(int sum,int b)
	{
	  int t;
	  if (sum == 0)
	  {
		return;
	  }
	  Get(sum / b, b);
	  t = sum % b;
	  if (t < 10)
	  {
		System.out.printf("%1d",t);
	  }
	  else
	  {
		System.out.printf("%1c",t - 10 + 'A');
	  }
	}
	public static int Main()
	{
		int a; //a???????,b???????,k???????,sum????????
		int b;
		int k = 0;
		int sum = 0;
		int i;
		int j = 0;
		String num = new String(new char[10000]); //????????
		String other = new String(new char[10000]); //????????
		int[] another = new int[10000];
			  a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			  num = ConsoleInput.readToWhiteSpace(true).charAt(0);
			  b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  k = num.length();
		for (i = 0;i <= k - 1;i++) //??????
		{
				 if (num.charAt(i) >= 65 && num.charAt(i) <= 90)
				 {
				  sum = sum + (num.charAt(i) - 55) * pow(a, (k - i - 1));
				 }
			  else if (num.charAt(i) >= 97 && num.charAt(i) <= 122)
			  {
				   sum = sum + (num.charAt(i) - 87) * pow(a, (k - i - 1));
			  }
			   else if (num.charAt(i) >= 48 && num.charAt(i) <= 57)
			   {
					sum = sum + (num.charAt(i) - 48) * pow(a, (k - i - 1));
			   }
		}

	   /**   do//???b?? 
	      {
	        another[j]=sum%b;               
	        sum=sum/b;               
	        if(another[j]>=0&&another[j]<=9)
	           {other[j]=another[j]+48;}            
	        else               
	            {other[j]=another[j]+55;}
	            j=j+1;          
	             }while(sum>0);
	        for(i=j;i>=0;i--)     
	       {      
	              cout<<other[i];//??
	                             }*/
	  if (sum != 0)
	  {
	  Get(sum, b);
	  System.out.print("\n");
	  }
	  else
	  {
		System.out.print("0");
		System.out.print("\n");
	  }
		return 0;
	}

}

