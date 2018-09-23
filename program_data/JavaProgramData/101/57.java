//******************************//
 //*     ?????				*//
 //*     ???1000012711		*//
 //*     ??????			*//
 //*     ???2010.11.17		*//
 //******************************// 
void judge(int, int, int);
int main()
{
	int a;
	int b;
	int c;
	int g;
	int cc11;
	int cc12;
	int cc21;
	int cc22;
	int cc31;
	int cc32;
	g = 0;
	for (a = 1; a <= 3; a++)
	{
		for (b = 1; b <= 3; b++)
		{
			for (c = 1; c <= 3; c++)
			{
				cc11 = (b > a);
				cc12 = (c == a);
				cc21 = (a > b);
				cc22 = (a > c);
				cc31 = (c > b);
				cc32 = (b > a);
				if ((cc11 + cc12 == 3 - a) && (cc21 + cc22 == 3 - b) && (cc31 + cc32 == 3 - c))
				{
					g = 1;
					break;
				}
			}
			if (g == 1)
			{
				break;
			}
		}
		if (g == 1)
		{
			break;
		}
	}
	judge(a, b, c);
	return 0;
}
void judge(int a,int b,int c)
{
	int i;
	int j;
	int[] n = {0, a, b, c};
	for (i = 1; i <= 3; i++)
	{
		for (j = 1; j <= 3; j++)
		{
			if (n[j] == i)
			{
				System.out.print((char)(j + 64));
			}
		}
	}
	System.out.print("\n");
}
