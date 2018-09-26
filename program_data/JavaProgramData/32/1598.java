public class jianfa
{
	public String bjs = new String(new char[100]);
	public String js = new String(new char[100]);
}

package <missing>;

public class GlobalMembers
{
	public static jianfa[] a = tangible.Arrays.initializeWithDefaultjianfaInstances(20);
	public static void Main()
	{
		int i;
		int[] l = new int[20];
		int[] j = new int[20];
		int k;
		int n;
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
			a[i].bjs = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			a[i].js = tempVar3.charAt(0);
		}
		System.in.read();
		l[i] = String.valueOf(a[i].bjs).length();
		j[i] = String.valueOf(a[i].js).length();
		}
		for (k = 0;k < n;k++)
		{
		for (i = 0;i < j[k];i++)
		{
			a[k].bjs = tangible.StringFunctions.changeCharacter(a[k].bjs, l[k] - 1 - i, a[k].bjs.charAt(l[k] - 1 - i) - a[k].js.charAt(j[k] - 1 - i) + 48);
			if (a[k].bjs.charAt(l[k] - 1 - i) < 48)
			{
				a[k].bjs = tangible.StringFunctions.changeCharacter(a[k].bjs, l[k] - 1 - i, a[k].bjs.charAt(l[k] - 1 - i) + 10);
				a[k].bjs = tangible.StringFunctions.changeCharacter(a[k].bjs, l[k] - 2 - i, a[k].bjs.charAt(l[k] - 2 - i) - 1);
			}
		}
		System.out.println(a[k].bjs);
		}
	}
}

