package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[54]);
		String str2 = new String(new char[54]);
		int i;
		int j;
		int n;
		int m;
		int t;
		int x;
		int flag = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str2 = tempVar2.charAt(0);
		}
		  n = str1.length();
		  m = str2.length();
		  for (i = 0;i < m - n;i++)
		  {
			  x = 0;
			  flag = 1;
			  for (j = i;j < i + n - 1;j++)
			  {
				  if (str1.charAt(x) != str2.charAt(j))
				  {
					  flag = 0;
					  break;
				  }
				  x++;
			  }
			  if (flag == 1)
			  {
				  break;
			  }
		  }
		  System.out.printf("%d",i);
		return 0;
	}
}

