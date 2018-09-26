package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] shu = new int[500];
		int k;
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int l;
		int l;
		String s = new String(new char[500]);
		char[][] m = new char[500][6];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		s = new Scanner(System.in).nextLine();
		l = s.length();
		for (i = 0;i <= l - n;i++)
		{
			for (j = 0;j < n;j++)
			{
			m[i][j] = s.charAt(i + j);
			  m[i][n] = '\0';
			}
		}
		for (i = 0;i <= l - n;i++)
		{
			shu[i] = 1;
		   for (j = i + 1;j <= l - n;j++)
		   {

		   if (strcmp(m[i],m[j]) == 0)
		   {
				 shu[i] = shu[i] + 1;
		   }
		   }
		}
		k = 0;
		for (i = 0;i <= l - n;i++)
		{
		   if (shu[i] > k)
		   {
			k = shu[i];
		   }
		}
		   if (k == 1)
		   {
			   System.out.print("NO\n");
		   }
		   else
		   {
			System.out.printf("%d\n",k);
			for (i = 0;i <= l - n;i++)
			{
			if (shu[i] == k)
			{
				 System.out.printf("%s\n",m[i]);
			}
			}
		   }
		return 0;
	}



}

