package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[] input = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char i = 0;
		char len;
		while (scanf("%c", input[i]) != -1 && input[i] != '\n')
		{
			i++;
		}
		for (i--;i >= 0;i--)
		{
			System.out.printf("%d",input[i] - '0');
		}
		System.out.print("\n");
	}
}
