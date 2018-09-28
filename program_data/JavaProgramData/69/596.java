package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 String str1 = new String(new char[252]);
		 String str2 = new String(new char[252]);
		 int[] a = new int[300];
		 int[] b = new int[300];
		 int[] c = new int[300];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		 memset(a,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		 memset(b,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		 memset(c,0,(Integer.SIZE / Byte.SIZE));
		 int i;
		 int j;
		 int k;
		 int n;
		 int l1;
		 int l2;
		 int l3;
		 str1 = new Scanner(System.in).nextLine();
		 str2 = new Scanner(System.in).nextLine();
		 l1 = str1.length();
		 l2 = str2.length();
		 for (i = l1 - 1 ;i >= 0;i--)
		 {
		 a[l1 - i] = str1.charAt(i) - '0';
		 }
		 for (i = l2 - 1; i >= 0;i--)
		 {
		 b[l2 - i] = str2.charAt(i) - '0';
		 }
		 if (l1 >= l2)
		 {
		 l3 = l1;
		 }
		 else
		 {
			 l3 = l2;
		 }
		 for (i = 1;i <= l3;i++)
		 {
		 c[i] += a[i] + b[i];
		 if (c[i] >= 10)
		 {
		 c[i + 1]++;
		 c[i] -= 10;
		 }
		 }
		 for (k = l3 + 1;k >= 0;k--)
		 {
			 if (c[k] != 0)
			 {
				 break;
			 }
		 }
		 if (k <= 0)
		 {
			 System.out.print("0");
		 }
		 else
		 {
		 for (i = k ; i > 0;i--)
		 {
		 System.out.printf("%d",c[i]);
		 }
		 }
	}

}
