public class strnu
{
	public String a = new String(new char[50]);
	public int n;
}

package <missing>;

public class GlobalMembers
{
	public static strnu[] t = tangible.Arrays.initializeWithDefaultstrnuInstances(200);
	public static int max(strnu[] e, int p)
	{
		int i;
		int mx = e[0].n;
		int k = 0;
		for (i = 0;i <= p;i++)
		{
			if (e[i].n > mx)
			{
				mx = e[i].n;
				k = i;
			}
		}
		return k;
	}
	public static int min(strnu[] e, int p)
	{
		int i;
		int mn = e[0].n;
		int k = 0;
		for (i = 0;i <= p;i++)
		{
			if (e[i].n < mn)
			{
				mn = e[i].n;
				k = i;
			}
		}
		return k;
	}


	public static void Main()
	{
		int i;
		char b;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				t[i].a = tempVar.charAt(0);
			}
			b = System.in.read();
			t[i].n = String.valueOf(t[i].a).length();
			if (b == '\n')
			{
				break;
			}
		}
		System.out.printf("%s\n",t[max(t, i)].a);
		System.out.printf("%s",t[min(t, i)].a);
	}

}

