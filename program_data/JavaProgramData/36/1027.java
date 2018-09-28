package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 String a = new String(new char[1001]);
		 String b = new String(new char[1001]);
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
		 int[] x1 = new int[26];
		 int[] x2 = new int[26];
		 int[] s1 = new int[26];
		 int[] s2 = new int[26];
		 int a1;
		 int b1;
		 a1 = a.length();
		 b1 = b.length();
		 if (a1 != b1)
		 {
		 System.out.print("NO");
		 }
		 else
		 {
			 for (int i = 0;i < a1;i++)
			 {
				 if (a.charAt(i) <= 'z' && a.charAt(i) >= 'a')
				 {
				 x1[a.charAt(i) - 'a']++;
				 }
				 if (a.charAt(i) <= 'Z' && a.charAt(i) >= 'A')
				 {
				 x2[a.charAt(i) - 'A']++;
				 }
				 if (b.charAt(i) <= 'z' && b.charAt(i) >= 'a')
				 {
				 s1[b.charAt(i) - 'a']++;
				 }
				 if (b.charAt(i) <= 'Z' && b.charAt(i) >= 'A')
				 {
				 s2[b.charAt(i) - 'A']++;
				 }
			 }
		 int count = 0;
		 for (int i = 0;i < 26;i++)
		 {
				 if (s1[i] != x1[i])
				 {
								 count++;
								 break;
				 }
				 if (s2[i] != x2[i])
				 {
								 count++;
								 break;
				 }
		 }
		 if (count == 0)
		 {
		 System.out.print("YES");
		 }
		 else
		 {
		 System.out.print("NO");
		 }
		 }
	}


}

