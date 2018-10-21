package <missing>;

public class GlobalMembers
{
	public static void array(String a)
	{
		int l;
		int i;
		int j;
		int max;
		char aa;
		l = a.length();
		for (i = 0;i < l;i++)
		{
			max = i;
		 for (j = i + 1;j < l;j++)
		 {
			 if (a[j].compareTo(a[max]) > 0)
			 {
				 max = j;
			 }
		 }
		 aa = a[i];
		 a[i] = a[max];
		 a[max] = aa;
		}
	}
	public static void Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
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
		array(a);
		array(b);
		if (strcmp(a,b) == 0)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}
	}
}

