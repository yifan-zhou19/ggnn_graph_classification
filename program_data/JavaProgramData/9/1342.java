//C++ TO JAVA CONVERTER NOTE: Classes must be named in Java, so the following class has been named AnonymousClass:
	public class AnonymousClass
	{
	public String id = new String(new char[11]);
	public int nianling;
	}

package <missing>;

public class GlobalMembers
{
		public static AnonymousClass[] bing = tangible.Arrays.initializeWithDefaultAnonymousClassInstances(100);


	public static int Main()
	{
			int n;
			int i;
			int j;
			int e;
		int[] youxian = new int[100];
		int[] zhengchang = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				bing[i].id = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				bing[i].nianling = Integer.parseInt(tempVar3);
			}
			if (bing[i].nianling >= 60)
			{
				youxian[i] = bing[i].nianling;
			}
			else
			{
				zhengchang[i] = bing[i].nianling;
			}
		}
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (youxian[j] < youxian[j + 1])
				{
					e = youxian[j + 1];
					youxian[j + 1] = youxian[j];
					youxian[j] = e;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (bing[j].nianling == youxian[i])
				{
					System.out.printf("%s\n", bing[j].id);
					bing[j].nianling = -1;
					break;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (bing[j].nianling == zhengchang[i])
				{
					System.out.printf("%s\n", bing[j].id);
					bing[j].nianling = -1;
					break;
				}
			}
		}



		return 0;
	}


}

