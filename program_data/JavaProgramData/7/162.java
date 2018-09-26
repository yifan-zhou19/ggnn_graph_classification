package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String string1 = new String(new char[256]);
		String string2 = new String(new char[256]);
		String string3 = new String(new char[256]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			string1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			string2 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			string3 = tempVar3.charAt(0);
		}
		int length1;
		int length2;
		int length3;
		int i;
		int j;
		int temp;
		length1 = string1.length();
		length2 = string2.length();
		length3 = string3.length();
		for (i = 0;i <= (length1 - length2);i++)
		{
			if (string1.charAt(i) == string2.charAt(0))
			{
				j = 1;
				temp = i + 1;
				while (j < length2 && string1.charAt(temp) == string2.charAt(j))
				{
					temp++;
					j++;
				}
				if (j == length2)
				{
					string2 = string1.Substring(temp);
					string1.Substring(i) = string3;
					string1.Substring(i) + length3 = string2;
					break;
				}
			}
		}
		System.out.printf("%s\n",string1);
	}

}

