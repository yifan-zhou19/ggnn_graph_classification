public class p
{
	   public String id = new String(new char[11]);
	   public int age;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void sort(int n,struct p a[101]);
		int n;
		int i;
		p[] a = tangible.Arrays.initializeWithDefaultpInstances(101);
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
							a[i].id = tempVar2.charAt(0);
						}
						String tempVar3 = ConsoleInput.scanfRead(" ");
						if (tempVar3 != null)
						{
							a[i].age = Integer.parseInt(tempVar3);
						}
		}
		sort(n, a);

		return 0;
	}

	public static void sort(int n, p[] a)
	{
		 int i;
		 int k = 0;
		 for (i = 0;i < n;i++)
		 {
						 if ((a[i].age) > k)
						 {
						 k = (a[i].age);
						 }
		 }
		 for (;k > 59;k--)
		 {
					   for (i = 0;i < n;i++)
					   {
									   if ((a[i].age) == k)
									   {
														System.out.printf("%s\n",a[i].id);
														(a[i].age) = 0;
									   }
					   }
		 }
		 for (i = 0;i < n;i++)
		 {
						 if ((a[i].age) != 0)
						 {
										  System.out.printf("%s\n",a[i].id);
						 }
		 }
	}
}

