Feature: Testes Amazon

    Scenario: Adicionar ao Carrinho
		Given que estou logado na plataforma da Amazon
		When pesquiso o produto alexa
        And adiciono ele ao carrinho
		Then o produto deve ser adicionado ao carrinho