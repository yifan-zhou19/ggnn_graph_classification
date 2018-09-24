package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		int len;
		int sum;
		int zm;
		String zfc = new String(new char[100000]);
		char zm1;
		String p = zfc;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
		sum = 0;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			zfc = tempVar2.charAt(0);
		}
		len = zfc.length();
		for (zm = 0;zm < len;zm++)
		{
		  for (i = 0;i < len;i++)
		  {
			  if (*(p.Substring(i)) == *(p.Substring(zm)))
			  {
			  sum++;
			  }
		  }
		  if (sum == 1)
		  {
			 zm1 = (p.Substring(zm));
			 break;
		  }
		  else
		  {
		  sum = 0;
		  }
		}
		if (sum == 1)
		{
		System.out.printf("%c\n",zm1);
		}
		else
		{
		System.out.print("no\n");
		}
		}
	}
}

