package <missing>;

public class GlobalMembers
{
	public static int flag(String a)
	{
		int i;
		int k = 1;
		if (a[0].compareTo(65) < 0 || (a[0].compareTo(90) > 0 && a[0].compareTo(95) < 0) || (a[0].compareTo(95) > 0 && a[0].compareTo(97) < 0) || a[0].compareTo(122) > 0)
		{
			return 0;
		}
		else
		{
			 for (i = 1;i < a.length();i++)
			 {
			 if (a[i].compareTo(48) < 0 || (a[i].compareTo(57) > 0 && a[i].compareTo(65) < 0) || (a[i].compareTo(90) > 0 && a[i].compareTo(95) < 0) || (a[i].compareTo(95) > 0 && a[i].compareTo(97) < 0) || a[i].compareTo(122) > 0)
			 {
			 return 0;
			 }
			 }
		}
		return 1;
	}
	public static void Main()
	{
		 int i;
		 int j;
		 int n;
		 String a = new String(new char[21]);
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 for (i = 0;i < n;i++)
		 {
			 scanf(" ");
			 a = new Scanner(System.in).nextLine();
			 if (flag(a) != 0)
			 {
				 System.out.print("yes\n");
			 }
			 else
			 {
				 System.out.print("no\n");
			 }
		 }

	}

}

