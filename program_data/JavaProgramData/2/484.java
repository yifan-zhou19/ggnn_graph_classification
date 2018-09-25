public class Au
{
	public int num;
	public int[] a = new int[1000];
}

package <missing>;

public class GlobalMembers
{
	public static Au[] au = tangible.Arrays.initializeWithDefaultAuInstances(26);
	public static int Main()
	{
		int i;
		int n;
		int buch;
		int tn;
		String s = new String(new char[30]);
		for (i = 0; i < 26; i++)
		{
			au[i].num = 0;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n-- != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				buch = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s = tempVar3.charAt(0);
			}
			for (i = 0; s.charAt(i); i++)
			{
				tn = au[s.charAt(i) - 'A'].num;
				au[s.charAt(i) - 'A'].a[tn] = buch;
				au[s.charAt(i) - 'A'].num++;
			}
		}
		int temp = 0;
		for (i = 1; i < 26; i++)
		{
			if (au[i].num > au[temp].num)
			{
				temp = i;
			}
		}
		System.out.printf("%c\n%d\n", 'A' + temp, au[temp].num);
		for (i = 0; i < au[temp].num; i++)
		{
			System.out.printf("%d\n", au[temp].a[i]);
		}
		return 0;
	}

}

