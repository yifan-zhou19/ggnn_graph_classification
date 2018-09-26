package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String name = new String(new char[10]);
		String num = new String(new char[101]);
		int i;
		int j;
		int k;
		while ((num = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
						k = 0;
						int[] num2 = new int[100];
						for (i = 0;i < 100;i++)
						{
						num2[i] = 0;
						}

						i = 0;
						for (i = 0;num.charAt(i) != '\0';i++)
						{
						 num2[i] = (k * 10 + num.charAt(i) - '0') / 13;
						 k = (k * 10 + num.charAt(i) - '0') % 13;

						}
						 if (num.length() <= 2 && ((num.charAt(0) - '0' == 1 && num.charAt(1) - '0' <= 2) || (num.charAt(1) == '\0')))
						 {
						 System.out.print("0");
						 }
						 if (num.charAt(0) == '1' && (num.charAt(1) - '0') <= 2)
						 {
						 for (i = 2;i <= num.length() - 1;i++)
						 {
									System.out.print(num2[i]);
						 }
						 }
						 else
						 {
						 for (i = 1;i <= num.length() - 1;i++)
						 {
									System.out.print(num2[i]);
						 }
						 }
									System.out.print("\n");
									System.out.print(k);
									System.out.print("\n");
		}
		return 0;
	}




}

