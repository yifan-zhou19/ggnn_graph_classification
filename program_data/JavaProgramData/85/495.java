package <missing>;

public class GlobalMembers
{
	public static String judge(tangible.RefObject<String> head)
	{
		int i;
		int k = 0;
		String put = null;
		if (((head.argValue <= 'z') && (head.argValue >= 'a')) || ((head.argValue <= 'Z') && (head.argValue >= 'A')) || (head.argValue == '_'))
		{
			if (strcmp(head.argValue,"int") == 0 || strcmp(head.argValue,"double") == 0 || strcmp(head.argValue,"float") == 0 || strcmp(head.argValue,"for") == 0 || strcmp(head.argValue,"else") == 0 || strcmp(head.argValue,"if") == 0)
			{
			   put = "no";
			}

			else

			{
				for (i = 1; * (head.argValue.Substring(i)) != '\0';i++)

				{

					if (((*(head.argValue.Substring(i)) <= 'z') && (*(head.argValue.Substring(i)) >= 'a')) || ((*(head.argValue.Substring(i)) <= 'Z') && (*(head.argValue.Substring(i)) >= 'A')) || (*(head.argValue.Substring(i)) <= '9') && (*(head.argValue.Substring(i)) >= '0') || (*(head.argValue.Substring(i)) == '_'))
					{

						k++;
					}

					else

					{
						put = "no";
						break;
					}

				}
				if (head.argValue.length() - 1 == k)
				{
					put = "yes";
				}
			}

		}

		else
		{
			put = "no";
		}

		return (put);
	}

	public static void Main()
	{
		int n;
		int i;
		char[] a = {'0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
		tangible.RefObject<String> tempRef_a = new tangible.RefObject<String>(a);
			System.out.printf("%s\n",judge(tempRef_a));
			a = tempRef_a.argValue;
		}

	}
	//vc???pg????
}

