package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 int[] l = new int[1000];
	 int count = 0;
	 char[][] s = new char[1000][40];
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
		   s[i] = tempVar2.charAt(0);
	   }
	   l[i] = String.valueOf(s[i]).length();
	 }
	 for (i = -1;i < n;i)
	 {
	   i++;
	   System.out.printf("%s",s[i]);
	   count = l[i] + l[i + 1] + 1;
	   while (count <= 80 && i < n - 1)
	   {
		 i++;
		 System.out.print(" ");
		 System.out.printf("%s",s[i]);
		 count += 1 + l[i + 1];
	   }
	   System.out.print("\n");
	 }

	  return 0;
	}
}

