package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[300]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		int i;
		int j;
		int k = 0;
		int a = 0;
		int m;
		int p = 0;
		int N;
		int l = 0;
		N = str.length();
		for (j = 0;j < 300;j++)
		{
		   if (str.charAt(j) >= 65 && str.charAt(j) <= 90 || str.charAt(j) >= 97 && str.charAt(j) <= 122)
		   {
			   l++;
		   }
		   if (str.charAt(j) == 0)
		   {
		   break;
		   }
		}
		if (l == 0)
		{
		   System.out.print("No");
		}
		else
		{
		   for (i = 65;i <= 90;i++)
		   {
			   for (j = 0;j < N;j++)
			   {
				   if (str.charAt(j) == i)
				   {
					  k++;
				   }
				   if (str.charAt(j) == 0)
				   {
				   break;
				   }
			   }
			  if (k != 0)
			  {
			  System.out.printf("%c=%d\n",i,k);
			  }
			  k = 0;
		   }
		   for (m = 97;m <= 122;m++)
		   {
			   for (j = 0;j < N;j++)
			   {
				   if (str.charAt(j) == m)
				   {
					  p++;
				   }
				   if (str.charAt(j) == 0)
				   {
					  break;
				   }
			   }
			   if (p != 0)
			   {
			   System.out.printf("%c=%d\n",m,p);
			   }
			   p = 0;
		   }
		}
	 return 0;
	}

}

