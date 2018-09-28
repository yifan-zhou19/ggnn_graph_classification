public class SeqList
{
	public int MAXNUM;
	public int n;
	public int[] element;
}

package <missing>;

public class GlobalMembers
{
	public static SeqList createNullList_Seq(int m) //??????
	{
		int i;
		SeqList palist =  new SeqList();
		if (palist != null)
		{
			palist.element = new int[m];
			if (palist.element != null)
			{
				palist.MAXNUM = m;
				palist.n = 0;
				for (i = 0; i < m; i++)
				{
					palist.element[i] = 0;
				}
				return palist;
			}
			else
			{
				palist = null;
			}
		}
		System.out.print("Out of space!! ");
		System.out.print("\n");
		return null;
	}

	public static int isNullList_Seq(SeqList palist) //???????
	{
		return (palist.n == 0);
	}

	public static int initialList_Seq(SeqList pblist) //??????
	{
		int i;
		if (isNullList_Seq(pblist) != 0)
		{
			return -1;
		}

		for (i = 0; i < pblist.n; i++)
		{
			pblist.element[i] = 0;
		}
		return 0;

	}

	public static int insertEnd_Seq(SeqList palist, int x)
	{
		if (palist.n >= palist.MAXNUM) //??
		{
			System.out.print("Overflow! ");
			System.out.print("\n");
			return -1;
		}
		palist.element[palist.n] = x;
		palist.n += 1;
		return 0;
	}

	public static int add(SeqList num1, SeqList num2, SeqList sum)
	{
		int a = initialList_Seq(sum); //?sum????????
		int i;
		for (i = 0; i < MAX_LEN; i++)
		{
			//?num1?num2???????????????sum??
			sum.element[i] = num1.element[i] + num2.element[i];
		}
		for (i = 0; i <= MAX_LEN; i++)
		{
			if (sum.element[i] > 9)
			{
				sum.element[i] -= 10;
				sum.element[i + 1] += 1;
			}
		}
		return 0;

	}

	public static int printList_Seq(SeqList result) //????
	{
		if (isNullList_Seq(result) == 0) //??????
		{
			return -1;
		}
		int i;
		int flag = 0;
		for (i = MAX_LEN; i >= 0; i--)
		{
			if (result.element[i] != 0) //??????????????
			{
				flag = 1;
			}
			if (flag == 0)
			{
				continue;
			}
			System.out.print(result.element[i]);
		}
		if (flag == 0)
		{
			System.out.print(0);
		}
		System.out.print("\n");
		return 0;
	}

	public static int Main()
	{
		SeqList element1 = createNullList_Seq(MAX_LEN);
		SeqList element2 = createNullList_Seq(MAX_LEN);
		SeqList result = createNullList_Seq(MAX_LEN + 1);

		String szLine1 = new String(new char[MAX_LEN + 10]);
		String szLine2 = new String(new char[MAX_LEN + 10]);
		szLine1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		szLine2 = ConsoleInput.readToWhiteSpace(true).charAt(0);

		int lenth1 = szLine1.length();
		int lenth2 = szLine2.length();
		//cout << "eeeee1" << endl;
		if (lenth1 > MAX_LEN || lenth2 > MAX_LEN)
		{
			System.out.print("Input error!!");
			System.out.print("\n");
			return 0;
		}
	   //cout << "eeeee2" << endl;
		int i;
		for (i = lenth1 - 1; i >= 0; i--)
		{
			int a = insertEnd_Seq(element1, szLine1.charAt(i) - '0');
			if (a == -1)
			{
				System.out.print("Input error !! ");
				System.out.print("\n");
				return 0;
			}
		}
		for (i = lenth2 - 1; i >= 0; i--)
		{
			int b = insertEnd_Seq(element2, szLine2.charAt(i) - '0');
			if (b == -1)
			{
				System.out.print("Input error !! ");
				System.out.print("\n");
				return 0;
			}
		}
		//cout << "eeeee3" << endl;
		int c = add(element1, element2, result);
		if (c == -1)
		{
			System.out.print("Fail in add!! ");
			System.out.print("\n");
			return 0;
		}
		//cout << "eeeee4" << endl;
		printList_Seq(result);
		//cout << "eeeee5" << endl;

		return 0;
	}
}

