package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String ca = new String(new char[251]);
		String cb = new String(new char[251]);
		char tempc;
		int[] ia = new int[251];
		int[] ib = new int[251];
		int[] result = new int[251];
		int numa = 0;
		int numb = 0;
		int jinwei = 0;
		int weishu = 0;
		int resultweishu = 0;
		ca = ConsoleInput.readToWhiteSpace(true).charAt(0);
		cb = ConsoleInput.readToWhiteSpace(true).charAt(0);
		numa = ca.length();
		numb = cb.length();
		//cout << numa << " " << numb << endl;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(ia,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(ib,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(result,0,(Integer.SIZE / Byte.SIZE));
		if (numa > numb)
		{
			weishu = numa;
		}
		else
		{
			weishu = numb;
		}
		for (int i = 0;i < numa;i++)
		{
			tempc = ca.charAt(numa - i - 1);
			ia[i] = Integer.parseInt(tempc);
		}
		for (int i = 0;i < numb;i++)
		{
			tempc = cb.charAt(numb - i - 1);
			ib[i] = Integer.parseInt(tempc);
		}
		for (int i = 0;i <= weishu;i++)
		{
			result[i] = ia[i] + ib[i] + jinwei;
			if (result[i] > 9)
			{
				result[i] = result[i] - 10;
				jinwei = 1;
			}
			else
			{
				jinwei = 0;
			}
		}
		for (int i = 250;i >= 0;i--)
		{
			if (result[i] != 0)
			{
				resultweishu = i;
				break;
			}
		}
		for (int i = resultweishu;i >= 0; i--)
		{
			System.out.print(result[i]);
		}
		System.out.print("\n");
	}


	/*#include<iostream>
	
	int mycmp(const void *a, const void *b)
	{
		return *(int *)a - *(int *)b;
	}
	
	int main()
	{
		int n = 0;
		cin >> n;
		int tianji[1000] = {0};
		int qiwang[1000] = {0};
		int isusedt[1000] = {0};
		int isusedq[1000] = {0};
		int tempt = 0;
		int tempq = 0;
		while(n != 0)
		{
			memset(tianji,0,sizeof(int));
			memset(qiwang,0,sizeof(int));
			memset(isusedt,0,sizeof(int));
			memset(isusedq,0,sizeof(int));
			tempt = 0;
			tempq = 0;
			for(int i = 0;i < n;i ++)
				cin >> tianji[i];
			for(int i = 0;i < n;i ++)
				cin >> qiwang[i];
			qsort(tianji,n,sizeof(int),mycmp);
			qsort(qiwang,n,sizeof(int),mycmp);
			for(int i = tempt;i < n;i ++)
			{
			}
			cin >> n;
		}
		return 0;
	}*/
}

