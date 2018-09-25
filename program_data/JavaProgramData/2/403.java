public class chs
{
	public String zz = new String(new char[27]);
	public int num;
}

package <missing>;

public class GlobalMembers
{
	public static chs[] cs;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	public static chs * p = new chs();
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		chs cs = (chs)malloc(sizeof(chs) * n);
		for (p = cs;p < cs + n;p++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(p.num) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p.zz = tempVar3.charAt(0);
			}
		}
		int l;
		int a;
		int[] zm = new int[26];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * z;
		for (z = zm;z < zm + 26;z++)
		{
			*z = 0;
		}
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		for (p = cs;p < cs + n;p++)
		{
			l = p.zz.length();
			for (q = p.zz; * q != '\0';q++)
			{
				a = (int)(*q);
				(zm[a - 65])++;
			}
		}
		int max = 0;
		for (z = zm;z < zm + 26;z++)
		{
			if (*z > zm[max])
			{
				max = z - zm;
			}
		}
		System.out.printf("%c\n%d\n",(char)(max + 65),zm[max]);
		for (p = cs;p < cs + n;p++)
		{
			l = p.zz.length();
			for (q = p.zz; * q != '\0';q++)
			{
				a = (int)(*q);
				if ((a - 65) == max)
				{
					System.out.printf("%d\n",p.num);
				}
			}
		}
		cs = null;
		return 0;
	}

}

