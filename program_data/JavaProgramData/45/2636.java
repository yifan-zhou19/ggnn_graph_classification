package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int i;
		 int j;
		 int k;
		 int m = 0;
		 int n;
		 int n1;
		 int n2;
		 String s1 = new String(new char[60]);
		 String s2 = new String(new char[60]);
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 s1 = tempVar.charAt(0);
		 }
		 String tempVar2 = ConsoleInput.scanfRead(" ");
		 if (tempVar2 != null)
		 {
			 s2 = tempVar2.charAt(0);
		 }
		 n1 = s1.length();
		 n2 = s2.length();
		 for (j = 0;j < n2;j++)
		 {
			 if (m == 1)
			 {
		 break;
			 }
		 if (s1.charAt(0) == s2.charAt(j))
		 {
			 k = j;
		 for (i = 0;i < n1;i++)
		 {
			 if (s1.charAt(i) != s2.charAt(k))
			 {
		 break;
			 }
		 else
		 {
		 k++;
		 }
		 if (i == n1 - 1)
		 {
			 m = 1;
			 break;
		 }
		 }
		 }
		 }
		 System.out.printf("%d",j - 1);

	}

}

