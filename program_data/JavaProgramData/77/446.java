package <missing>;

public class GlobalMembers
{
	public static void f(int n, tangible.RefObject<Integer> a, tangible.RefObject<String> b, char boy, char girl)
	{
		 int i;
		 if (n == 2)
		 {
			 System.out.printf("%d %d\n", a.argValue,*(a.argValue+1));
		 }
		 else
		 {
			 for (i = 0;i < n;i++)
			 {
							 if (*(b.argValue.Substring(i)) == boy && *(b.argValue.Substring(i) + 1) == girl)
							 {
								  System.out.printf("%d %d\n",*(a.argValue + i),*(a.argValue + i + 1));
								  break;
							 }
			 }

			 for (;i < n - 2;i++)
			 {
			 *(a.argValue + i) = *(a.argValue + i + 2);
			 *(b.argValue.Substring(i)) = *(b.argValue.Substring(i) + 2);
			 }
			 f(n - 2, a, b, boy, girl);
		 }
	}

	public static int Main()
	{
		int[] a = new int[1000];
		int geshu;
		int i;
		String b = new String(new char[1000]);
		char boy;
		char girl;
		b = new Scanner(System.in).nextLine();
		geshu = b.length();
		for (i = 0;i < geshu;i++)
		{
			a[i] = i;
		}
		boy = b.charAt(0);
		girl = b.charAt(geshu - 1);
	tangible.RefObject<Integer> tempRef_a = new tangible.RefObject<Integer>(a);
	tangible.RefObject<String> tempRef_b = new tangible.RefObject<String>(b);
		f(geshu, tempRef_a, tempRef_b, boy, girl);
		b = tempRef_b.argValue;
		a = tempRef_a.argValue;
	}


}

