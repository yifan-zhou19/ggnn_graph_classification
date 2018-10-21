public class patience
{
	   public int shunxu;
	   public String id = new String(new char[10]);
	   public int age;
}

package <missing>;

public class GlobalMembers
{
		   public static patience[] pa = tangible.Arrays.initializeWithDefaultpatienceInstances(100);
	public static int Main()
	{
		int n;
		int i;
		int j;
		int p = 60;
		int q = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		for (i = 0;i < n;i++)
		{
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 pa[i].id = tempVar2.charAt(0);
						 }
						 String tempVar3 = ConsoleInput.scanfRead();
						 if (tempVar3 != null)
						 {
							 pa[i].age = Integer.parseInt(tempVar3);
						 }
		}
		for (i = 0;i < n;i++)
		{
						 if (pa[i].age >= 60)
						 {
										   q++;
						 }
		}
		do
		{
		for (i = 0;i < n;i++)
		{
						 if (pa[i].age >= p)
						 {
										  p = pa[i].age;
						 }
		}
		for (i = 0;i < n;i++)
		{
						 if (pa[i].age == p)
						 {
										  System.out.printf("%s\n",pa[i].id);
										  pa[i].age = 0;
						 }
		}
		p = 60;
		q--;
		} while (q > 0);
		for (i = 0;i < n;i++)
		{
						 if (pa[i].age < 60 && pa[i].age>0)
						 {
										 System.out.printf("%s\n",pa[i].id);
						 }
		}
		return 0;
	}

}

