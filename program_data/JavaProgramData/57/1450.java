package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		 int n;
		 int p;
		 int i;
		 int j;
		 String a = new String(new char[50]);
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 for (i = 0;i < n;i++)
		 {
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 a = tempVar2.charAt(0);
			 }
			 String s = a;
			 p = a.length();
			 if (((*(s.Substring(p) - 2) == 'e') && (*(s.Substring(p) - 1) == 'r')) || ((*(s.Substring(p) - 2) == 'l') && (*(s.Substring(p) - 1) == 'y')))
			 {
				for (j = 0;j < p - 2;j++)
				{
					System.out.printf("%c",a.charAt(j));
				}
				System.out.print("\n");
			 }
			 else
			 {
				 for (j = 0;j < p - 3;j++)
				 {
					 System.out.printf("%c",a.charAt(j));
				 }
				 System.out.print("\n");
			 }
		 }

	}
}

