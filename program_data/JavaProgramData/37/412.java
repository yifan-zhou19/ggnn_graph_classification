package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			q = Integer.parseInt(tempVar);
		}
		for (int s = 0;s < q;s++)
		{
			String a = new String(new char[100000]);
				int n;
				int i;
				int j;
				int m;
				int k = 0;
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a = tempVar2.charAt(0);
				}
				n = a.length();
					for (i = 0;i < n;i++)
					{
							m = 0;
							for (j = 0;j < n;j++)
							{
							   if (a.charAt(i) == a.charAt(j))
							   {
							   m++;
							   }
							}
							if (m == 1)
							{
								System.out.printf("%c\n",a.charAt(i));
							 k = 1;
							break;
							}
					}
	  if (k == 0)
	  {
	  System.out.print("no\n");
	  }
		}
	}

}

