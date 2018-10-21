package <missing>;

public class GlobalMembers
{
	public static int cmp(tangible.RefObject<String> a, tangible.RefObject<String> b)
	{
		return a.argValue - b.argValue;
	}
	public static int Main()
	{
		String a = new String(new char[M]);
		String b = new String(new char[M]);
		int len1;
		int len2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		len1 = a.length();
		len2 = b.length();

		if (len1 == len2)
		{
			qsort(a,len1,(Character.SIZE / Byte.SIZE),cmp);
			qsort(b,len2,(Character.SIZE / Byte.SIZE),cmp);
			if (strcmp(a,b))
			{
				System.out.print("NO\n");
			}
			else
			{
				System.out.print("YES\n");
			}
		}
		else
		{
			System.out.print("NO\n");
		}


		return 0;

	}

}

