//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
	public static final int base = 250;
	public static final int start = 5;
	public static int[] ans = new int[300];
	public static int Main()
	{
	void trans(char s[],int num[]);
	void plus(int a[],int b[]);
	int minus = new int(int a[],int b[]);
	void print(int num[]);
	int judge = new int(int a[],int b[]);

	int[] a = new int[300];
	int[] b = new int[300];
	String sa = new String(new char[300]);
	String sb = new String(new char[300]);
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (int i = 1;i <= n;i++)
	{
	System.in.read();
	sa = new Scanner(System.in).nextLine();
	sb = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	memset(a,0,300 * (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	memset(b,0,300 * (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	memset(ans,0,300 * (Integer.SIZE / Byte.SIZE));
	trans(sa, a);
	trans(sb, b);
	b[0] = 0 - b[0];
	if (a[0] * b[0] > 0)
	{
	plus(a, b);
	ans[0] = a[0];
	}
	else
	{
	int flag = judge(a, b);
	if (flag == 0)
	{
		System.out.print("0\n");
		continue;
	}
	if (flag > 0)
	{
		minus(a, b);
		ans[0] = a[0];
	}
	else
	{
		minus(b, a);
		ans[0] = b[0];
	}
	}
	print(ans);
	}
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	}

	public static void trans(String s, int[] num)
	{
	int len = s.length();
	int b = 0;
	num[0] = 1;
	if (s[0].equals('-'))
	{
		len--;
		b++;
		num[0] = -1;
	}
	for (int t = 0;t < len;t++)
	{
	num[base - len + t + 1] = s[t + b] - '0';
	}
	num[1] = base - len + 1;
	}

	public static int judge(int[] a, int[] b)
	{
	if (a[1] < b[1])
	{
		return 1;
	}
	else if (a[1] > b[1])
	{
		return -1;
	}
	else
	{
		 int t;
		 int p = 0;
		 int floor = a[1] < b[1] != 0?a[1]:b[1];
		 for (t = floor;t <= base != 0 && p == 0;t++)
		 {
		 p = a[t] - b[t];
		 }
		 if (p == 0)
		 {
			 return 0;
		 }
		 else
		 {
			 return p > 0?1:-1;
		 }
	}
	}

	public static void check(int[] num)
	{
	int p;
	for (p = start;num[p] == 0 && p <= base;p++)
	{
		;
	}
	num[1] = p;
	}

	public static void plus(int[] a, int[] b)
	{
	int floor = a[1] < b[1] != 0?a[1]:b[1];
	for (int t = base;t >= floor;t--)
	{
	int k = ans[t] + a[t] + b[t];
	ans[t] = k % 10;
	ans[t - 1] += k / 10;
	}
	if (ans[floor - 1] != 0)
	{
		ans[1] = floor - 1;
	}
	else
	{
		ans[1] = floor;
	}
	}

	public static void minus(int[] a, int[] b)
	{
	int floor = a[1] < b[1] != 0?a[1]:b[1];
	for (int t = base;t >= floor;t--)
	{
	int k = ans[t] + a[t] - b[t];
	if (k < 0)
	{
		ans[t - 1] -= 1;
		k += 10;
	}
	ans[t] = k % 10;
	ans[t - 1] += k / 10;
	}
	check(ans);
	}

	public static void print(int[] num)
	{
	if (num[0] < 0)
	{

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


