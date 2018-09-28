package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 1;i <= n;i++)
		{
			String pnew;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			pnew = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
			pnew = new Scanner(System.in).nextLine();
			int L = pnew.length();
			int judge = 0;
			int j;

			if (pnew == '_')
			{
				judge = 1;
			for (j = 1;j < L;j++)
			{
			if (*(pnew.Substring(j)) == '_')
			{
				judge = 1;
			}
			else if (*(pnew.Substring(j)) <= 'z' && *(pnew.Substring(j)) >= 'a')
			{
				judge = 1;
			}
			else if (*(pnew.Substring(j)) <= 'Z' && *(pnew.Substring(j)) >= 'A')
			{
				judge = 1;
			}
			else if (*(pnew.Substring(j)) <= '9' && *(pnew.Substring(j)) >= '0')
			{
				judge = 1;
			}
			else
			{
				judge = 0;
				break;
			}
			}
			}

			else if (pnew <= 'z' && pnew >= 'a')
			{
				judge = 1;
			for (j = 1;j < L;j++)
			{
			if (*(pnew.Substring(j)) == '_')
			{
				judge = 1;
			}
			else if (*(pnew.Substring(j)) <= 'z' && *(pnew.Substring(j)) >= 'a')
			{
				judge = 1;
			}
			else if (*(pnew.Substring(j)) <= 'Z' && *(pnew.Substring(j)) >= 'A')
			{
				judge = 1;
			}
			else if (*(pnew.Substring(j)) <= '9' && *(pnew.Substring(j)) >= '0')
			{
				judge = 1;
			}
			else
			{
				judge = 0;
				break;
			}
			}
			}

			else if (pnew <= 'Z' && pnew >= 'A')
			{
				judge = 1;
			for (j = 1;j < L;j++)
			{
			if (*(pnew.Substring(j)) == '_')
			{
				judge = 1;
			}
			else if (*(pnew.Substring(j)) <= 'z' && *(pnew.Substring(j)) >= 'a')
			{
				judge = 1;
			}
			else if (*(pnew.Substring(j)) <= 'Z' && *(pnew.Substring(j)) >= 'A')
			{
				judge = 1;
			}
			else if (*(pnew.Substring(j)) <= '9' && *(pnew.Substring(j)) >= '0')
			{
				judge = 1;
			}
			else
			{
				judge = 0;
				break;
			}
			}
			}

			else
			{
				judge = 0;
			}
			System.out.printf("%d\n",judge);
		}
	}







}

