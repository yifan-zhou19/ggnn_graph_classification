package <missing>;

public class GlobalMembers
{
	public static int compare(Object a, Object b)
	{
		return*(String)b - (String)a;
	}
	public static void Main(String[] args)
	{
		int i;
		int n;
		int j;
		int tmp;
		int len1;
		int len2;
		String a = new String(new char[1000]);
		String b = new String(new char[1000]);

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b,0,(Character.SIZE / Byte.SIZE));
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
		len2 = a.length();
		qsort(a,len1,(Character.SIZE / Byte.SIZE),compare);
		qsort(b,len2,(Character.SIZE / Byte.SIZE),compare);


			if (strcmp(a,b) == 0)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}

	}


}

