package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[10]);
		String b = new String(new char[10]);
		int[] numa = new int[130];
		int[] numb = new int[130];
		int i;
		int flag = 1;
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
		for (i = 0;i < (int)a.length();i++)
		{
			numa[a.charAt(i)]++;
		}
		for (i = 0;i < (int)b.length();i++)
		{
			numb[b.charAt(i)]++;
		}
		for (i = 'A';i < 'z';i++)
		{
			if (numa[i] != numb[i])
			{
				flag = 0;
				break;
			}
		}
			if (flag != 0)
			{
				System.out.print("YES");
			}
			else
			{
				System.out.print("NO");
			}
			return 0;
	}
}

