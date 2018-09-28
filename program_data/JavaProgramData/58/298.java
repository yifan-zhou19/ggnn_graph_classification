package <missing>;

public class GlobalMembers
{
	public static int check(String a)
	{
		int t = a.length();
		int i;
		int j = 1;
		 if ((a[0].compareTo('a') >= 0 && a[0].compareTo('z') <= 0) || (a[0].equals('_')))
		 {
					 if (t == 1)
					 {
						 return 1;
					 }
				 for (i = 1;i < t;i++)
				 {
				  if ((a[i].compareTo('a') >= 0 && a[i].compareTo('z') <= 0) || (a[i].compareTo('A') >= 0 && a[i].compareTo('Z') <= 0) || (a[i].compareTo('0') >= 0 && a[i].compareTo('9') <= 0) || (a[i].equals('_')))
				  {
				  j++;
				  }
				 }
		 }
		 else if (a[0].compareTo('A') >= 0 && a[0].compareTo('Z') <= 0)
		 {
					 if (t == 1)
					 {
						 return 1;
					 }
									  for (i = 1;i < t;i++)
									  {
				  if ((a[i].compareTo('a') >= 0 && a[i].compareTo('z') <= 0) || (a[i].compareTo('A') >= 0 && a[i].compareTo('Z') <= 0) || (a[i].compareTo('0') >= 0 && a[i].compareTo('9') <= 0) || (a[i].equals('_')))
				  {
				  j++;
				  }
									  }
		 }
		 else
		 {
			 return 0;
		 }
		 if (j == i)
		 {
		 return 1;
		 }
		 else
		 {
			 return 0;
		 }
	}
	public static int Main()
	{
		  int n;
		  int i;
		  String a = new String(new char[100]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  a = new Scanner(System.in).nextLine();
		  for (i = 0;i < n;i++)
		  {
			  a = new Scanner(System.in).nextLine();
				 int k = check(a);
				 System.out.printf("%d\n",k);
		  }
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();

	}

}

