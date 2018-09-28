package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[256]);
		String ow = new String(new char[256]);
		String rw = new String(new char[256]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			ow = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			rw = tempVar3.charAt(0);
		}
		int lens;
		int lenow;
		int i;
		int j;
		int k;
		int l;
		int t;
		int flag;
		lens = s.length();
		lenow = ow.length();
		for (i = 0;i <= (lens - lenow);i++)
		{
			flag = 1;
			for (j = 0;j < lenow;j++)
			{
				if (s.charAt(i + j) != ow.charAt(j))
				{
					flag = 0;
					break;
				}
			}
			if (flag != 0)
			{
				t = i;
				break;
			}
		}
		if (flag == 0)
		{
			System.out.printf("%s",s);
		}
		else
		{
			for (k = 0;k < t;k++)
			{
				System.out.printf("%c",s.charAt(k));
			}
			System.out.printf("%s",rw);
			for (l = t + lenow;l < lens;l++)
			{
				System.out.printf("%c",s.charAt(l));
			}
		}
		return 0;
	}
}

