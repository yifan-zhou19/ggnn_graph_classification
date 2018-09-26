package <missing>;

public class GlobalMembers
{
	public static void preProcess(tangible.RefObject<String> p)
	{
		for (int i = 0; i < p.argValue.length(); i++)
		{
			if (*(p.argValue.Substring(i)) - 'a' >= 0 && *(p.argValue.Substring(i)) - 'z' <= 0)
			{
				*(p.argValue.Substring(i)) = '0' + (*(p.argValue.Substring(i)) - 'a' + 10);
				continue;
			}
			if (*(p.argValue.Substring(i)) - 'A' >= 0 && *(p.argValue.Substring(i)) - 'Z' <= 0)
			{
				*(p.argValue.Substring(i)) = '0' + (*(p.argValue.Substring(i)) - 'A' + 10);
				continue;
			}
		}
	}

	public static int Main()
	{
		int m;
		int n;
		String sOrig = new String(new char[200]);
		String sRes = new String(new char[200]);

		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sOrig = ConsoleInput.readToWhiteSpace(true).charAt(0);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

	tangible.RefObject<String> tempRef_sOrig = new tangible.RefObject<String>(sOrig);
		preProcess(tempRef_sOrig);
		sOrig = tempRef_sOrig.argValue;

		//cout << sOrig << endl;

		int nValue = 0;

//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = sOrig;
		while (*p != '\0')
		{
			nValue = nValue * m + *p++ - '0';
		}

//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * s = sRes;
		if (nValue == 0)
		{
			*s++= '0';
		}
		while (nValue != 0)
		{
			if (nValue % n < 10)
			{
				*s++= nValue % n + '0';
			}
			else
			{
				*s++= nValue % n - 10 + 'A';
			}
			nValue /= n;
		}
		*s--= '\0';

		while (s >= sRes)
		{
			System.out.print(s--);
		}
		System.out.print("\n");

		return 0;
	}
}

