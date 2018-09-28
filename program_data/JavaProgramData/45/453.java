package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int athena;
		int zeus;
		String a = new String(new char[50]);
		String b = new String(new char[50]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * pa;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * pb;
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
		pa = a;
		pb = b;
		athena = 0;
		for (i = 0;i < b.length() && athena != 1;i++, pb++)
		{

			if (*pb == *pa)
			{
				zeus = 0;
			for (j = i;j < i + a.length();j++,pa++,pb++)
			{
					if (*pb != *pa)
					{
						zeus = 1;
					}
			}
				if (zeus == 0)
				{
					athena = 1;
				}
				pa = a;
				pb = b.charAt(i);
			}
			if (athena != 0)
			{
				System.out.printf("%d",i);
			}
		}
	}
}

