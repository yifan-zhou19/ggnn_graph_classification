package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String[] s = new String[100];
		String a;
		String b;
		int i;
		for (i = 0;;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
			s[i] = (String)calloc(1,100 * (Character.SIZE / Byte.SIZE));
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				s[i] = tempVar.charAt(0);
			}
			if (System.in.read() == '\n')
			{
				break;
			}
		}
		int n = i;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		a = (String)calloc(1,100 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		b = (String)calloc(1,100 * (Character.SIZE / Byte.SIZE));
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = tempVar3.charAt(0);
		}
		for (i = 0;i <= n;i++)
		{
			if (strcmp(s[i],a) == 0)
			{
				s[i] = b;
			}
		}
		for (i = 0;i <= n;i++)
		{
			if (i == 0)
			{
				System.out.printf("%s",s[i]);
			}
			else
			{
				System.out.printf(" %s",s[i]);
			}
		}


	}
}

