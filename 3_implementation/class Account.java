class Account
  attr_reader :balance

  def initialize(amount)
    @balance = amount
  end

  def update_balance(amount)
    balance += amount
  end

  # Other cash methods
end