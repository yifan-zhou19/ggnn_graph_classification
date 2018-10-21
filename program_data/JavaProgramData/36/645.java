public class letter
{
	public char name;
	public int times;
}

package <missing>;

public class GlobalMembers
{
	public static letter[] leta = tangible.Arrays.initializeWithDefaultletterInstances(57);
	public static letter[] letb = tangible.Arrays.initializeWithDefaultletterInstances(57);

	public static int Main()
	{
		int i;
		int lena;
		int lenb;
		int t = 0;
		char[] a = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char[] b = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		for (i = 0;i < 57;i++)
		{
			leta[i].name = 'a' + i;
			letb[i].name = 'a' + i;
			leta[i].times = 0;
			letb[i].times = 0;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		lena = a.length();
		lenb = b.length();
		if (lena != lenb)
		{
			System.out.print("NO");
			return 0;
		}
		else
		{
			for (i = 0;i < lena;i++)
			{
				leta[a[i] - 65].times++;
				letb[b[i] - 65].times++;
			}
			for (i = 0;i < 57;i++)
			{
				if (leta[i].times != letb[i].times)
				{
					t = 1;
				}
			}
			if (t == 0)
			{
				System.out.print("YES");
			}
			else
			{
				System.out.print("NO");
			}
		}
	}
}

