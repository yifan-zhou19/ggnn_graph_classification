public class patient
{
	public String num = new String(new char[10]);
	public int age;
}

package <missing>;

public class GlobalMembers
{
	public static patient[] a = tangible.Arrays.initializeWithDefaultpatientInstances(100);
	public static void Main()
	{
		  int max = new int(int b[],int m);
			int n;
			int i;
			int j = 0;
			int[] c = new int[100];
			int g;
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
				a[i].num = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i].age = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			c[i] = a[i].age;
		}
	 g = max(c, n);
		while (g >= 60)
		{
				 for (i = 0;i < n;i++)
				 {
					 if (c[i] == g)
					 {
				 System.out.printf("%s\n",a[i].num);
				 c[i] = 0;
					 }
				 }
			   g = max(c, n);

		}
			 for (i = 0;i < n;i++)
			 {

				 if (a[i].age < 60)
				 {
					 System.out.printf("%s\n",a[i].num);
				 }
			 }
	}
	public static int max(int[] b, int m)
	{
		int t;
		int s;
	  s = b[0];
	  for (t = 0;t < m;t++)
	  {
	  if (s < b[t])
	  {
		  s = b[t];
	  }
	  }
	  return (s);
	}
}

