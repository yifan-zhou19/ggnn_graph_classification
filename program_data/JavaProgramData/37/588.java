package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			 int j;
			 int[] temp = new int[26];
			 String ch = new String(new char[1000001]);
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 ch = tempVar2.charAt(0);
			 }
			 int len = ch.length();
			 for (j = 0;j < len;j++)
			 {
				  temp[ch.charAt(j) - 97]++;
				 // cout<<temp[ch[j]-97]     <<endl;
			 }
			/* for( int i=0;i<26;i++ )
			 {
			      cout<<temp[i]<<" ";     
			 }*/
			 for (j = 0;j < len;j++)
			 {
				  if (temp[ch.charAt(j) - 97] == 1)
				  {
					  System.out.printf("%c\n",ch.charAt(j));
					  break;
				  }

			 }
			 if (j == len)
			 {
					   System.out.print("no\n");
			 }
		}
	}
}

