package <missing>;

public class GlobalMembers
{
	public static void move(String a)
	{
		char t;
		 int l;
		 int i;
		 int j;
		 l = a.length();
		 for (i = 0;i < l;i++)
		 {
		 for (j = i + 1;j < l;j++)
		 {
			 if (a[j] + '0' < a[i] + '0' != null)
			 {
			 t = a[j];
		 a[j] = a[i];
		 a[i] = t;
			 }
		 }
		 }
	}
	public static void Main()
	{
		String a = new String(new char[10]);
		String b = new String(new char[10]);
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
		move(a);
		move(b);
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

