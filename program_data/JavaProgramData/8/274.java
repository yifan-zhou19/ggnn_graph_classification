package <missing>;

public class GlobalMembers
{
	public static int[] num1 = new int[1000];
	public static int[] num2 = new int[1000];
	public static int a;
	public static int b;

	public static void shuru()
	{
		int i;
	 a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 for (i = 0;i < a;i++)
	 {
		 num1[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 }
	 for (i = 0;i < b;i++)
	 {
		 num2[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 }
	}

	public static void sequence()
	{
		int i;
		int j;
		int temp;
	 for (i = 0;i < a;i++)
	 {
		 for (j = i + 1;j < a;j++)
		 {
			 if (num1[i] > num1[j])
			 {
			 temp = num1[i];
			 num1[i] = num1[j];
			 num1[j] = temp;
			 }
		 }
	 }
	 for (i = 0;i < a;i++)
	 {
		 for (j = i + 1;j < b;j++)
		 {
			 if (num2[i] > num2[j])
			 {
			 temp = num2[i];
			 num2[i] = num2[j];
			 num2[j] = temp;
			 }
		 }
	 }
	}

	public static void shuchu()
	{
		int i;
	 for (i = 0;i < a;i++)
	 {
		 System.out.print(num1[i]);
		 System.out.print(' ');
	 }
	 for (i = 0;i < b - 1;i++)
	 {
		 System.out.print(num2[i]);
		 System.out.print(' ');
	 }
	 System.out.print(num2[b - 1]);
	 System.out.print("\n");
	}

	public static int Main()
	{
		shuru();
	 sequence();
	 shuchu();
	 return 0;
	}

}

