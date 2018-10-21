public class bing
{
	   public String a = new String(new char[10]);
	   public int age;
}

package <missing>;

public class GlobalMembers
{
	public static bing[] bing = tangible.Arrays.initializeWithDefaultbingInstances(1000);
	public static int Main()
	{
		int n;
		int i;
		int j = 1;
		int v = 1;
		int k;
		int[] t = new int[1000];
		int m;
		int[] p = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 bing[i].a = tempVar2.charAt(0);
		 }
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 bing[i].age = Integer.parseInt(tempVar3);
		 }
		 if (bing[i].age >= 60)
		 {
			t[j] = i;
			j++;
		 }
		 else
		 {
			 p[v] = i;
			 v++;
		 }
		}
		 j--;
		 v--;
		if (j != 0)
		{
			for (i = 1;i < j;i++)
			{
			 for (k = 1;k < j - i + 1;k++)
			 {
			 if (bing[t[k]].age < bing[t[k + 1]].age)
			 {
				m = t[k];
				t[k] = t[k + 1];
				t[k + 1] = m;
			 }
			 }
			}
		}
		for (i = 1;i <= j;i++)
		{
		System.out.printf("%s\n",bing[t[i]].a);
		}
		for (i = 1;i <= v;i++)
		{
		System.out.printf("%s\n",bing[p[i]].a);
		}
		System.in.read();
		System.in.read();
		System.in.read();
	}




}

