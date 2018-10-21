package <missing>;

public class GlobalMembers
{
	 public static int max(int a,int b)
	 {
		 if (a >= b)
		 {
			return a;
		 }
		 else
		 {
			return b;
		 }
	 }
	 public static int Main()
	 {
		 int[] a1 = new int[260];
		 int[] a2 = new int[260];
		 String a_1 = new String(new char[260]);
		 String a_2 = new String(new char[260]);
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 a_1 = tempVar.charAt(0);
		 }
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 a_2 = tempVar2.charAt(0);
		 }
		 int n;
		 int i;
		 for (i = 0;i < 260;i++)
		 {
			a1[i] = 0;
			a2[i] = 0;
		 }
		 int l1 = a_1.length();
			n = 0;
		 for (i = l1 - 1;i >= 0;i--)
		 {
			a1[n++] = a_1.charAt(i) - '0';
		 }
		 int l2 = a_2.length();
			n = 0;
		 for (i = l2 - 1;i >= 0;i--)
		 {
			a2[n++] = a_2.charAt(i) - '0';
		 }
		 for (i = 0;i < 250;i++)
		 {
			a1[i] = a1[i] + a2[i];
			if (a1[i] >= 10)
			{
			   a1[i] = a1[i] - 10;
			   a1[i + 1]++;
			}
		 }
		 for (i = max(l1, l2);i >= 0;i--)
		 {
			if (a1[i] != 0)
			{
			   n = i;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			   goto t;
			}
			else
			{
			   n = i;
			}
			if (n == 0)
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			   goto t;
			}
		 }
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		 t:
		 for (i = n;i >= 0;i--)
		 {
			  System.out.printf("%d",a1[i]);
		 }
	 }
}

