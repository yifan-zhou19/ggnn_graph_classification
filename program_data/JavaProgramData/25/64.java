package <missing>;

public class GlobalMembers
{
	/*???????2?N??
	 *??????
	 *???2010/12/16
	 *???1000010449
	 */
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'p', so pointers on this parameter are left unchanged:
	public static void multiply(char * p)
	{
		int[] num = new int[70];
		int i = 0;
		int end;

		num[0] = 0;
		while (*(p.Substring(i)) != '\0')
		{
			num[i + 1] = 2 * (*(p.Substring(i)) - '0');
			i++;
		}

		end = i;
		for (i = end; i > 0; i--)
		{
			num[i - 1] += num[i] / 10;
			num[i] %= 10;
		}
		if (num[0] == 0)
		{
			i = 1;
		}
		else
		{
			i = 0;
		}

		while (i <= end)
		{
			*p ++= num[i++] + '0';
		}
		*p = '\0';

		return;
	}
	public static int Main()
	{
		final String result = "1";
		int n;
		int i;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 0; i < n; i++)
		{
			multiply(result);
		}


		System.out.print(result);
		System.out.print("\n");

		return 0;
	}
}

